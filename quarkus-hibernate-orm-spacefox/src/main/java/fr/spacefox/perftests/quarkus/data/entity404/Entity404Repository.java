package fr.spacefox.perftests.quarkus.data.entity404;

import fr.spacefox.perftests.quarkus.core.port.data.Entity404DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service404.model.Model404;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity404Repository implements Entity404DatasourcePort, PanacheRepository<Entity404> {
    @Override
    public Optional<Model404> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
