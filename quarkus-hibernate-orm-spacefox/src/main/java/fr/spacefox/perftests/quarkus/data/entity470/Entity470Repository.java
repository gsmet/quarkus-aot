package fr.spacefox.perftests.quarkus.data.entity470;

import fr.spacefox.perftests.quarkus.core.port.data.Entity470DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service470.model.Model470;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity470Repository implements Entity470DatasourcePort, PanacheRepository<Entity470> {
    @Override
    public Optional<Model470> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
