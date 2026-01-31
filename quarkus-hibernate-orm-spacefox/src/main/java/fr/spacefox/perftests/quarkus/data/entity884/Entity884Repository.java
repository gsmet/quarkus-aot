package fr.spacefox.perftests.quarkus.data.entity884;

import fr.spacefox.perftests.quarkus.core.port.data.Entity884DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service884.model.Model884;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity884Repository implements Entity884DatasourcePort, PanacheRepository<Entity884> {
    @Override
    public Optional<Model884> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
