package fr.spacefox.perftests.quarkus.data.entity131;

import fr.spacefox.perftests.quarkus.core.port.data.Entity131DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service131.model.Model131;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity131Repository implements Entity131DatasourcePort, PanacheRepository<Entity131> {
    @Override
    public Optional<Model131> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
