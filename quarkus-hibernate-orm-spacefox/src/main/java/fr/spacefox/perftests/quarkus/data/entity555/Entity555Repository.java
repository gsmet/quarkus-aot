package fr.spacefox.perftests.quarkus.data.entity555;

import fr.spacefox.perftests.quarkus.core.port.data.Entity555DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service555.model.Model555;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity555Repository implements Entity555DatasourcePort, PanacheRepository<Entity555> {
    @Override
    public Optional<Model555> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
