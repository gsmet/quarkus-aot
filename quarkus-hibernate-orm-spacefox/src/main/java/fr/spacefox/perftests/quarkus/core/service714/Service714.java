package fr.spacefox.perftests.quarkus.core.service714;

import fr.spacefox.perftests.quarkus.core.port.data.Entity714DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service714.model.Model714;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service714 {

    private final Entity714DatasourcePort datasource;

    public Service714(Entity714DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model714 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
