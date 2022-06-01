<?php 

//Commandクラス
interface DefaultCommand
{
    public function execute();
}

//Receiver  클래스.
class Words 
{
    private $wordsData;

    public function __construct($wordsData)
    {
        $this->wordsData = $wordsData;
    }

    public function convertUpper()
    {
        echo strtoupper($this->wordsData).'<br>'."\n";
    }

    public function convertKana()
    {
        echo mb_convert_kana($this->wordsData, "R").'<br>'."\n";
    }
    

}
//ConcreteCommand
class UpperCommand implements DefaultCommand
{
    private $words;
    public function __construct(Words $words)
    {
        $this->words = $words;
    }
    public function execute()
    {
        return $this->words->convertUpper();
    }
}

//ConcreteCommand
class KanaCommand implements DefaultCommand
{
    private $words;

    public function __construct(Words $words)
    {
        $this->words = $words;
    }
    public function execute()
    {
        $this->words->convertKana();
    }
}

class Queue 
{
    //Command오브젝트를 배열로써 세트한다.
    private $commands;
    private $currentIndex;
    
    public function __construct()
    {
        $this->commands = [];
        $this->currentIndex = 0;
    }

    public function addCommand (DefaultCommand $command)
    {
        $this->commands[] = $command;
    }

    public function removeCommand ()
    {
        array_shift($this->commands);
    }

    private function next()
    {
        if (count($this->commands) == 0 || count($this->commands) <= $this->currentIndex) {
            return;
        } else {
            return $this->commands[$this->currentIndex++];
        }
    }
 
    public function run()
    {
        while (!is_null($command = $this->next())) {
            echo $this->currentIndex;
            $command->execute();
        }
    }

}

$queue = new Queue();
// 命令をどのように実行するか知っているクラスのオブジェクト
$word = new Words('こんにちはhello');
// どの命令を実行するかセットする
$queue->addCommand(new UpperCommand($word));
$queue->addCommand(new KanaCommand($word));
$queue->addCommand(new UpperCommand($word));
$queue->addCommand(new KanaCommand($word));
$queue->addCommand(new UpperCommand($word));
$queue->addCommand(new KanaCommand($word));
$queue->addCommand(new KanaCommand($word));
//$queue->removeCommand();

$queue->run();