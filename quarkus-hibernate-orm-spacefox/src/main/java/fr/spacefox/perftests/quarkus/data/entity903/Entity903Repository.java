package fr.spacefox.perftests.quarkus.data.entity903;

import fr.spacefox.perftests.quarkus.core.port.data.Entity903DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service903.model.Model903;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity903Repository implements Entity903DatasourcePort, PanacheRepository<Entity903> {
    @Override
    public Optional<Model903> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
