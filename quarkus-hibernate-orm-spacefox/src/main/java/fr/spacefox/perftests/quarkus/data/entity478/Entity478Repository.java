package fr.spacefox.perftests.quarkus.data.entity478;

import fr.spacefox.perftests.quarkus.core.port.data.Entity478DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service478.model.Model478;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity478Repository implements Entity478DatasourcePort, PanacheRepository<Entity478> {
    @Override
    public Optional<Model478> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
