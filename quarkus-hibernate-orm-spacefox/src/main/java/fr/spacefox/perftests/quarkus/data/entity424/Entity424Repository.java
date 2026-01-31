package fr.spacefox.perftests.quarkus.data.entity424;

import fr.spacefox.perftests.quarkus.core.port.data.Entity424DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service424.model.Model424;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity424Repository implements Entity424DatasourcePort, PanacheRepository<Entity424> {
    @Override
    public Optional<Model424> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
