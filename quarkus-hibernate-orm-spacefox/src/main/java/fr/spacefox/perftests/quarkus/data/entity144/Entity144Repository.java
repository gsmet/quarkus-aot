package fr.spacefox.perftests.quarkus.data.entity144;

import fr.spacefox.perftests.quarkus.core.port.data.Entity144DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service144.model.Model144;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity144Repository implements Entity144DatasourcePort, PanacheRepository<Entity144> {
    @Override
    public Optional<Model144> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
