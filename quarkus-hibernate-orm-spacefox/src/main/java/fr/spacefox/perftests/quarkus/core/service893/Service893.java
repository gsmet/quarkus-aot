package fr.spacefox.perftests.quarkus.core.service893;

import fr.spacefox.perftests.quarkus.core.port.data.Entity893DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service893.model.Model893;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service893 {

    private final Entity893DatasourcePort datasource;

    public Service893(Entity893DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model893 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
