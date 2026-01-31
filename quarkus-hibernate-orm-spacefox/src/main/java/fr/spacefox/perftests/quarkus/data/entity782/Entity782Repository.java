package fr.spacefox.perftests.quarkus.data.entity782;

import fr.spacefox.perftests.quarkus.core.port.data.Entity782DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service782.model.Model782;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity782Repository implements Entity782DatasourcePort, PanacheRepository<Entity782> {
    @Override
    public Optional<Model782> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
