package fr.spacefox.perftests.quarkus.data.entity199;

import fr.spacefox.perftests.quarkus.core.port.data.Entity199DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service199.model.Model199;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity199Repository implements Entity199DatasourcePort, PanacheRepository<Entity199> {
    @Override
    public Optional<Model199> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
