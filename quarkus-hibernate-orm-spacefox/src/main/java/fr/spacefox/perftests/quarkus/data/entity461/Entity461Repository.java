package fr.spacefox.perftests.quarkus.data.entity461;

import fr.spacefox.perftests.quarkus.core.port.data.Entity461DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service461.model.Model461;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity461Repository implements Entity461DatasourcePort, PanacheRepository<Entity461> {
    @Override
    public Optional<Model461> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
