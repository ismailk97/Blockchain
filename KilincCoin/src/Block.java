import java.lang.reflect.Array;
import java.util.Arrays;

public class Block {


    private int previousHash; // the has of the previous block
    private String[] transactions; // shall contain transactions

    private int blockHash;// the hash of the block

    //the block takes in the previoush hash and a string containing transactions
    //the hash of both transactions and previous hash is the
    //hash of the current block.
    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contens = {Arrays.hashCode(transactions),previousHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    //use the getters since the variable is private
    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
