package fr.spacefox.perftests.quarkus.data.entity643;

import fr.spacefox.perftests.quarkus.core.port.data.Entity643DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service643.model.Model643;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity643Repository implements Entity643DatasourcePort, PanacheRepository<Entity643> {
    @Override
    public Optional<Model643> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
