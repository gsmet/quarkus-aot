package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service637.model.Model637;
import java.util.Optional;

public interface Entity637DatasourcePort {
    Optional<Model637> find(Long id);
}
