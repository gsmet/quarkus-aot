package fr.spacefox.perftests.quarkus.data.entity591;

import fr.spacefox.perftests.quarkus.core.port.data.Entity591DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service591.model.Model591;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity591Repository implements Entity591DatasourcePort, PanacheRepository<Entity591> {
    @Override
    public Optional<Model591> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
