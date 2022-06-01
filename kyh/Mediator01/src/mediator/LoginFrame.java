package mediator;

import collegue.Colleague;
import collegue.ColleagueButton;
import collegue.ColleagueCheckbox;
import collegue.ColleagueTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 레이아웃 매니저를 사용해서 4*2의 그리드를 만든다.
        setLayout(new GridLayout(4, 2));
        // Colleague들의 생성
        createColleagues();
        // 배치
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        // 유효/무효의 초기지정
        colleagueChanged(checkGuest);
        // 표시
        pack();
        show();
    }

    @Override
    public void createColleagues() {
        // 생성
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // Mediator의 세트
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // Listener의 세트
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged(Colleague c) {
        if (c == checkGuest || c == checkLogin) {
            if (checkGuest.getState()) {             // Guest 모드
                textUser.setColleagueText("");
                textPass.setColleagueText("");
                textUser.setColleagueEnabled(false);
                textPass.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(true);
            } else {                                 // Login 모드
                textUser.setColleagueEnabled(true);
            }
        } else if (c == textUser || c == textPass) {
            userPassChanged();
        } else {
            System.out.println("colleagueChanged:unknown colleague = " + c);
        }
    }

    private void userPassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);
        System.exit(0);
    }
}
