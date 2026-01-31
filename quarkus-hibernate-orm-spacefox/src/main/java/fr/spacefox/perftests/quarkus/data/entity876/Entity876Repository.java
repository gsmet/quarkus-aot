package fr.spacefox.perftests.quarkus.data.entity876;

import fr.spacefox.perftests.quarkus.core.port.data.Entity876DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service876.model.Model876;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity876Repository implements Entity876DatasourcePort, PanacheRepository<Entity876> {
    @Override
    public Optional<Model876> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
