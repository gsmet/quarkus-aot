package fr.spacefox.perftests.quarkus.data.entity184;

import fr.spacefox.perftests.quarkus.core.port.data.Entity184DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service184.model.Model184;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity184Repository implements Entity184DatasourcePort, PanacheRepository<Entity184> {
    @Override
    public Optional<Model184> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
