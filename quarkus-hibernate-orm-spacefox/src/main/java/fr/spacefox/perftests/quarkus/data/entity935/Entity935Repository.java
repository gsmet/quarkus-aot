package fr.spacefox.perftests.quarkus.data.entity935;

import fr.spacefox.perftests.quarkus.core.port.data.Entity935DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service935.model.Model935;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity935Repository implements Entity935DatasourcePort, PanacheRepository<Entity935> {
    @Override
    public Optional<Model935> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
