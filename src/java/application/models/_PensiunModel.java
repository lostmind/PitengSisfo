/** 
 * Autogenerated by Recite18th from table piteng.pensiun
 * Don't change this file. Instead, change the derived class PensiunModel
 * 
 */

package application.models;
import recite18th.model.Model;
public class _PensiunModel extends Model
{
    public String nip;
    public String sk_pensiun;
    public String tmt_pensiun;
    public String alasan_pensiun;
    public String idpensiun;
    public _PensiunModel()
    {
        tableName="pensiun";
        pkFieldName="idpensiun";
        fqn = PensiunModel.class.getName();
        plainClassName = "PensiunModel";
    }
    public void setNip(String nip)
    {
        this.nip=nip;
    }
    public String getNip()
    {        return this.nip;
    }
    public void setSk_pensiun(String sk_pensiun)
    {
        this.sk_pensiun=sk_pensiun;
    }
    public String getSk_pensiun()
    {        return this.sk_pensiun;
    }
    public void setTmt_pensiun(String tmt_pensiun)
    {
        this.tmt_pensiun=tmt_pensiun;
    }
    public String getTmt_pensiun()
    {        return this.tmt_pensiun;
    }
    public void setAlasan_pensiun(String alasan_pensiun)
    {
        this.alasan_pensiun=alasan_pensiun;
    }
    public String getAlasan_pensiun()
    {        return this.alasan_pensiun;
    }
    public void setIdpensiun(String idpensiun)
    {
        this.idpensiun=idpensiun;
    }
    public String getIdpensiun()
    {        return this.idpensiun;
    }
    public void get()
    {
        _PensiunModel result = (_PensiunModel) super.getModel();
        if(result!=null)
        {
            setNip(result.getNip());
            setSk_pensiun(result.getSk_pensiun());
            setTmt_pensiun(result.getTmt_pensiun());
            setAlasan_pensiun(result.getAlasan_pensiun());
            setIdpensiun(result.getIdpensiun());
        }
    }
}
