package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service936.model.Model936;
import java.util.Optional;

public interface Entity936DatasourcePort {
    Optional<Model936> find(Long id);
}
