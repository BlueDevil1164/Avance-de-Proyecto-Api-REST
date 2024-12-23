package mx.unam.dgtic.servicio.vendedor;

import mx.unam.dgtic.auth.dto.VendedorDTO;
import mx.unam.dgtic.auth.exception.VendedorNoExisteExepcion;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface IVendedorDTOService {

    public List<VendedorDTO> getVendedoresList();

    public List<VendedorDTO> getVendedoresPageable(int page, int size, String dirSort, String sort);

    public Optional<VendedorDTO> getVendedorById(int id);

    VendedorDTO updateVendedor(VendedorDTO vendedor) throws ParseException, VendedorNoExisteExepcion;

    VendedorDTO createVendedor(VendedorDTO vendedor) throws ParseException, VendedorNoExisteExepcion;

    public boolean deleteVendedor(int id);

    //public List<CompradorDTO> findCompradoresByGenero(int id);

}
