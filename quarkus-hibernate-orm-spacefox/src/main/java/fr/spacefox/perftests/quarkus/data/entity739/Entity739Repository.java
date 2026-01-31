package fr.spacefox.perftests.quarkus.data.entity739;

import fr.spacefox.perftests.quarkus.core.port.data.Entity739DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service739.model.Model739;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity739Repository implements Entity739DatasourcePort, PanacheRepository<Entity739> {
    @Override
    public Optional<Model739> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
