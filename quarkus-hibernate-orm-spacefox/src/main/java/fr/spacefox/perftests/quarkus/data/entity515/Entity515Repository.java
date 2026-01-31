package fr.spacefox.perftests.quarkus.data.entity515;

import fr.spacefox.perftests.quarkus.core.port.data.Entity515DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service515.model.Model515;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity515Repository implements Entity515DatasourcePort, PanacheRepository<Entity515> {
    @Override
    public Optional<Model515> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
