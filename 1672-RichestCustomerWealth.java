

class RichestCustomerWealth {
    public int maximumWealth(int [][]accounts){
        int maximumWealth = 0;

        for(int i=0;i<accounts.length;i++){
            int accountWealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                accountWealth += accounts[i][j];
                maximumWealth = Math.max(accountWealth, maximumWealth);
            }
        }
    return maximumWealth;
    }

    //Test Cases
    public void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        int [][] accounts2 = {{1,5},{7,3},{3,2}};
        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(accounts2));
    }
}
