package fr.spacefox.perftests.quarkus.data.entity916;

import fr.spacefox.perftests.quarkus.core.port.data.Entity916DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service916.model.Model916;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity916Repository implements Entity916DatasourcePort, PanacheRepository<Entity916> {
    @Override
    public Optional<Model916> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
