package fr.spacefox.perftests.quarkus.core.service839;

import fr.spacefox.perftests.quarkus.core.port.data.Entity839DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service839.model.Model839;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service839 {

    private final Entity839DatasourcePort datasource;

    public Service839(Entity839DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model839 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
