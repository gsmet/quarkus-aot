package fr.spacefox.perftests.quarkus.data.entity6;

import fr.spacefox.perftests.quarkus.core.port.data.Entity6DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service6.model.Model6;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity6Repository implements Entity6DatasourcePort, PanacheRepository<Entity6> {
    @Override
    public Optional<Model6> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
