<?php 
abstract class BattleHandler
{
    private $nextHandler;

    public function setNextHandler(BattleHandler $handler)
    {
        $this->nextHandler = $handler;
        return $this;
    }

    public function getNextHandler()
    {
        return $this->nextHandler;
    }

    public function battle($level)
    {
        if (!$this->battleResult($level)) {
            return $this->getMessage();
        } elseif (!is_null($this->getNextHandler())) {
            return $this->getNextHandler()->battle($level);
        } else {
            return "the end(clear)";
        }
    }

    public abstract function battleResult($level);
    public abstract function getMessage();
}

class RyuBattleHandler extends BattleHandler
{
    private $level = 10;

    public function battleResult($level)
    {
        return ($level > $this->level);
    }

    public function getMessage()
    {
        return 'Ryu win! You lose.';
    }
}
class KenBattleHandler extends BattleHandler
{
    private $level = 15;

    public function battleResult($level)
    {
        return ($level > $this->level);
    }

    public function getMessage()
    {
        return 'Ken win! You lose.';
    }
}
class HondaBattleHandler extends BattleHandler
{
    private $level = 20;

    public function battleResult($level)
    {
        return ($level > $this->level);
    }

    public function getMessage()
    {
        return 'Honda win! You lose.';
    }
}

$ryu = new RyuBattleHandler();
$ken = new KenBattleHandler();
$honda = new HondaBattleHandler();

$handler = $ryu->setNextHandler($ken->setNextHandler($honda));

for ($i=1; $i<=10; $i++) {
    $player_level = rand(1, 30);
    echo sprintf('play：%d회 째, 당신의 레벨은：%d !<br>', $i, $player_level);
    echo $handler->battle($player_level);
    echo '<br><br>';
}