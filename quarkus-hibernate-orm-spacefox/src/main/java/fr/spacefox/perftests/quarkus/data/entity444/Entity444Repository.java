package fr.spacefox.perftests.quarkus.data.entity444;

import fr.spacefox.perftests.quarkus.core.port.data.Entity444DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service444.model.Model444;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity444Repository implements Entity444DatasourcePort, PanacheRepository<Entity444> {
    @Override
    public Optional<Model444> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
