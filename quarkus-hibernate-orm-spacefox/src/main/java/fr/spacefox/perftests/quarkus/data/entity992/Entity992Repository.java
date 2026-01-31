package fr.spacefox.perftests.quarkus.data.entity992;

import fr.spacefox.perftests.quarkus.core.port.data.Entity992DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service992.model.Model992;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity992Repository implements Entity992DatasourcePort, PanacheRepository<Entity992> {
    @Override
    public Optional<Model992> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
