package fr.spacefox.perftests.quarkus.data.entity675;

import fr.spacefox.perftests.quarkus.core.port.data.Entity675DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service675.model.Model675;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity675Repository implements Entity675DatasourcePort, PanacheRepository<Entity675> {
    @Override
    public Optional<Model675> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
