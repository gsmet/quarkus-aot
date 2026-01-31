package fr.spacefox.perftests.quarkus.data.entity501;

import fr.spacefox.perftests.quarkus.core.port.data.Entity501DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service501.model.Model501;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity501Repository implements Entity501DatasourcePort, PanacheRepository<Entity501> {
    @Override
    public Optional<Model501> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
