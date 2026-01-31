package fr.spacefox.perftests.quarkus.data.entity195;

import fr.spacefox.perftests.quarkus.core.port.data.Entity195DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service195.model.Model195;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity195Repository implements Entity195DatasourcePort, PanacheRepository<Entity195> {
    @Override
    public Optional<Model195> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
