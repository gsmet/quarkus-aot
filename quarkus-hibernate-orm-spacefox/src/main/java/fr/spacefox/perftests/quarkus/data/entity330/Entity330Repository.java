package fr.spacefox.perftests.quarkus.data.entity330;

import fr.spacefox.perftests.quarkus.core.port.data.Entity330DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service330.model.Model330;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity330Repository implements Entity330DatasourcePort, PanacheRepository<Entity330> {
    @Override
    public Optional<Model330> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
