package fr.spacefox.perftests.quarkus.core.service645;

import fr.spacefox.perftests.quarkus.core.port.data.Entity645DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service645.model.Model645;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service645 {

    private final Entity645DatasourcePort datasource;

    public Service645(Entity645DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model645 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
