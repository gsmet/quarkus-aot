package fr.spacefox.perftests.quarkus.data.entity428;

import fr.spacefox.perftests.quarkus.core.port.data.Entity428DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service428.model.Model428;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity428Repository implements Entity428DatasourcePort, PanacheRepository<Entity428> {
    @Override
    public Optional<Model428> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
