package fr.spacefox.perftests.quarkus.data.entity58;

import fr.spacefox.perftests.quarkus.core.port.data.Entity58DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service58.model.Model58;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity58Repository implements Entity58DatasourcePort, PanacheRepository<Entity58> {
    @Override
    public Optional<Model58> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
