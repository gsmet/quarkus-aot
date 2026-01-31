package fr.spacefox.perftests.quarkus.data.entity201;

import fr.spacefox.perftests.quarkus.core.port.data.Entity201DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service201.model.Model201;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity201Repository implements Entity201DatasourcePort, PanacheRepository<Entity201> {
    @Override
    public Optional<Model201> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
