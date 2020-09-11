class Employee private constructor(builder: Employee.builder)

{
    var firstName:String?
    var lastName:String?
    var id:String?
    var isManger:Boolean?
    var ManagerId:String?


  init {

      this.firstName=builder.firstName
      this.lastName=builder.lastName
      this.id=builder.id
      this.isManger=builder.isManger
      this.ManagerId=builder.ManagerId

  }









    class builder
    {
        var firstName:String?=null;

        var lastName:String?=null;
        var id:String?=null;
        var isManger:Boolean?=null;
        var ManagerId:String?=null;

        fun setFirstname(firstName: String)=apply { this.firstName=firstName }
        fun setLastname(lastName: String)=apply { this.lastName=lastName }
        fun setID(id: String)=apply { this.id=id }
        fun setIsManager(isManger: Boolean)=apply { this.isManger=isManger }
        fun setmanagerid(ManagerId: String)=apply { this.ManagerId=ManagerId }
      fun build():Employee{
         return Employee(this)
      }

    }

}
fun main()
{
    val employee=Employee.builder().setFirstname("Doug").setLastname("Sigelbaum").setIsManager(false).setID("XXX")
   print(" ${employee.firstName}  ${employee.lastName}  ${employee.isManger} ${employee.id}  ")

}

