package fr.spacefox.perftests.quarkus.data.entity585;

import fr.spacefox.perftests.quarkus.core.port.data.Entity585DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service585.model.Model585;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity585Repository implements Entity585DatasourcePort, PanacheRepository<Entity585> {
    @Override
    public Optional<Model585> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
