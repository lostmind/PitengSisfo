/** 
 * Autogenerated by Recite18th from table piteng.unit_kerja
 * Don't change this file. Instead, change the derived class UnitKerjaModel
 * 
 */

package application.models;
import recite18th.model.Model;
public class _UnitKerjaModel extends Model
{
    public String Idunit_Kerja;
    public String Nama_Unit_Kerja;
    public _UnitKerjaModel()
    {
        tableName="unit_kerja";
        pkFieldName="Idunit_Kerja";
        fqn = UnitKerjaModel.class.getName();
        plainClassName = "UnitKerjaModel";
    }
    public void setIdunit_Kerja(String Idunit_Kerja)
    {
        this.Idunit_Kerja=Idunit_Kerja;
    }
    public String getIdunit_Kerja()
    {        return this.Idunit_Kerja;
    }
    public void setNama_Unit_Kerja(String Nama_Unit_Kerja)
    {
        this.Nama_Unit_Kerja=Nama_Unit_Kerja;
    }
    public String getNama_Unit_Kerja()
    {        return this.Nama_Unit_Kerja;
    }
    public void get()
    {
        _UnitKerjaModel result = (_UnitKerjaModel) super.getModel();
        if(result!=null)
        {
            setIdunit_Kerja(result.getIdunit_Kerja());
            setNama_Unit_Kerja(result.getNama_Unit_Kerja());
        }
    }
}
