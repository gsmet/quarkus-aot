package fr.spacefox.perftests.quarkus.data.entity985;

import fr.spacefox.perftests.quarkus.core.port.data.Entity985DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service985.model.Model985;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity985Repository implements Entity985DatasourcePort, PanacheRepository<Entity985> {
    @Override
    public Optional<Model985> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
