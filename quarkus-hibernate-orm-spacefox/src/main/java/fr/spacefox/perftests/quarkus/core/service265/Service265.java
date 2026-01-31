package fr.spacefox.perftests.quarkus.core.service265;

import fr.spacefox.perftests.quarkus.core.port.data.Entity265DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service265.model.Model265;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service265 {

    private final Entity265DatasourcePort datasource;

    public Service265(Entity265DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model265 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
