package fr.spacefox.perftests.quarkus.data.entity667;

import fr.spacefox.perftests.quarkus.core.port.data.Entity667DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service667.model.Model667;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity667Repository implements Entity667DatasourcePort, PanacheRepository<Entity667> {
    @Override
    public Optional<Model667> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
