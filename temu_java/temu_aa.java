class temu_aa{
	String[] temu;
	temu_aa(){
		temu = new String[7];
 		temu[0] = "######   #######  ##   ##  ##   ##";
		temu[1] = "# ## #    ##   #  ### ###  ##   ##";
 		temu[2] = "  ##      ## #    #######  ##   ##";
 		temu[3] = "  ##      ####    #######  ##   ##";
 		temu[4] = "  ##      ## #    ## # ##  ##   ##";
 		temu[5] = "  ##      ##   #  ##   ##  ##   ##";
		temu[6] = " ####    #######  ##   ##   ##### ";
	}
	void print(int i){
		System.out.println(this.temu[i]);
	}
}
