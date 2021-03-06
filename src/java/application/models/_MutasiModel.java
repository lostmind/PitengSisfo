/** 
 * Autogenerated by Recite18th from table piteng.mutasi
 * Don't change this file. Instead, change the derived class MutasiModel
 * 
 */

package application.models;
import recite18th.model.Model;
public class _MutasiModel extends Model
{
    public String idmutasi;
    public String nip;
    public String no_sk_mutasi;
    public String tmt_mutasi;
    public String tujuan_mutasi;
    public String jenis_mutasi;
    public String pejabat_berwenang;
    public String tempat_mutasi;
    public String tgl_mutasi;
    public _MutasiModel()
    {
        tableName="mutasi";
        pkFieldName="idmutasi";
        fqn = MutasiModel.class.getName();
        plainClassName = "MutasiModel";
    }
    public void setIdmutasi(String idmutasi)
    {
        this.idmutasi=idmutasi;
    }
    public String getIdmutasi()
    {        return this.idmutasi;
    }
    public void setNip(String nip)
    {
        this.nip=nip;
    }
    public String getNip()
    {        return this.nip;
    }
    public void setNo_sk_mutasi(String no_sk_mutasi)
    {
        this.no_sk_mutasi=no_sk_mutasi;
    }
    public String getNo_sk_mutasi()
    {        return this.no_sk_mutasi;
    }
    public void setTmt_mutasi(String tmt_mutasi)
    {
        this.tmt_mutasi=tmt_mutasi;
    }
    public String getTmt_mutasi()
    {        return this.tmt_mutasi;
    }
    public void setTujuan_mutasi(String tujuan_mutasi)
    {
        this.tujuan_mutasi=tujuan_mutasi;
    }
    public String getTujuan_mutasi()
    {        return this.tujuan_mutasi;
    }
    public void setJenis_mutasi(String jenis_mutasi)
    {
        this.jenis_mutasi=jenis_mutasi;
    }
    public String getJenis_mutasi()
    {        return this.jenis_mutasi;
    }
    public void setPejabat_berwenang(String pejabat_berwenang)
    {
        this.pejabat_berwenang=pejabat_berwenang;
    }
    public String getPejabat_berwenang()
    {        return this.pejabat_berwenang;
    }
    public void setTempat_mutasi(String tempat_mutasi)
    {
        this.tempat_mutasi=tempat_mutasi;
    }
    public String getTempat_mutasi()
    {        return this.tempat_mutasi;
    }
    public void setTgl_mutasi(String tgl_mutasi)
    {
        this.tgl_mutasi=tgl_mutasi;
    }
    public String getTgl_mutasi()
    {        return this.tgl_mutasi;
    }
    public void get()
    {
        _MutasiModel result = (_MutasiModel) super.getModel();
        if(result!=null)
        {
            setIdmutasi(result.getIdmutasi());
            setNip(result.getNip());
            setNo_sk_mutasi(result.getNo_sk_mutasi());
            setTmt_mutasi(result.getTmt_mutasi());
            setTujuan_mutasi(result.getTujuan_mutasi());
            setJenis_mutasi(result.getJenis_mutasi());
            setPejabat_berwenang(result.getPejabat_berwenang());
            setTempat_mutasi(result.getTempat_mutasi());
            setTgl_mutasi(result.getTgl_mutasi());
        }
    }
}
