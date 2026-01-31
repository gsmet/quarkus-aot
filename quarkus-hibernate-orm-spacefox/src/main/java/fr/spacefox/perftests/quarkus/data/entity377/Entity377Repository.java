package fr.spacefox.perftests.quarkus.data.entity377;

import fr.spacefox.perftests.quarkus.core.port.data.Entity377DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service377.model.Model377;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity377Repository implements Entity377DatasourcePort, PanacheRepository<Entity377> {
    @Override
    public Optional<Model377> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
