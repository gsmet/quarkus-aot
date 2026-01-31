package fr.spacefox.perftests.quarkus.data.entity1;

import fr.spacefox.perftests.quarkus.core.port.data.Entity1DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service1.model.Model1;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity1Repository implements Entity1DatasourcePort, PanacheRepository<Entity1> {
    @Override
    public Optional<Model1> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
