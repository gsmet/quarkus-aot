package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service120.model.Model120;
import java.util.Optional;

public interface Entity120DatasourcePort {
    Optional<Model120> find(Long id);
}
