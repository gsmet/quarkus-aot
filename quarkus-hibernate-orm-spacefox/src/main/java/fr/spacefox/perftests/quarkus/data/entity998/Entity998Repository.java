package fr.spacefox.perftests.quarkus.data.entity998;

import fr.spacefox.perftests.quarkus.core.port.data.Entity998DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service998.model.Model998;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity998Repository implements Entity998DatasourcePort, PanacheRepository<Entity998> {
    @Override
    public Optional<Model998> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
