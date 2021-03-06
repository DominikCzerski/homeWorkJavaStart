package homeWork_10.komputerZPodzespolami;

public class Computer {

    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }
}
