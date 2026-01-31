package fr.spacefox.perftests.quarkus.data.entity132;

import fr.spacefox.perftests.quarkus.core.port.data.Entity132DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service132.model.Model132;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity132Repository implements Entity132DatasourcePort, PanacheRepository<Entity132> {
    @Override
    public Optional<Model132> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
